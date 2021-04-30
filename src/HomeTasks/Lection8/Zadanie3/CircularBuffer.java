package HomeTasks.Lection8.Zadanie3;

public class CircularBuffer {
   private int bufferSize = 4;
   public BufferQueueElem startEl;
   public BufferQueueElem endEl;

   CircularBuffer() {
       startEl = new BufferQueueElem();
       endEl = startEl;
       for (int i = 0; i < bufferSize-1; i++) {
           endEl.nextEl = new BufferQueueElem();
           endEl = endEl.nextEl;
       }
       endEl.nextEl = startEl;
   }

   private class BufferQueueElem    {
       private Integer value;
       private BufferQueueElem nextEl;
       BufferQueueElem(Integer value, BufferQueueElem nextEl)    {
           this.value = value;
           this.nextEl = nextEl;
       }
       BufferQueueElem()    {
           this(null,null);
       }
       BufferQueueElem(Integer value)   {
           this(value,null);
       }

       @Override
       public String toString() {
           return ""+value;
       }
   }
   public boolean QueueEmpty()  {
       return startEl.value==null;
   }
   public Integer Dequeue() {
       Integer tmp = startEl.value;
       startEl.value = null;
       if(startEl.equals(endEl))
           endEl = startEl.nextEl;
       startEl = startEl.nextEl;

       return tmp;
   }
   public void Enqueue(Integer value)   {
       if(endEl.value!=null)    {
           if(endEl.nextEl.equals(startEl))
               doubleBuffer();
       }
       endEl=endEl.nextEl;
       endEl.value = value;
   }

    private void doubleBuffer() {
       BufferQueueElem tmp = endEl;
        for (int i = 0; i < bufferSize; i++) {
            tmp.nextEl = new BufferQueueElem();
            tmp = tmp.nextEl;

        }
        tmp.nextEl = startEl;
        bufferSize*=2;
    }

    public void operateWithBuffer(String cmd)    {
       String[] commands = cmd.split(" ");
       switch (commands[0]) {
           case "EMPTY":
               System.out.println(QueueEmpty());
               break;
           case "DEQ":
               System.out.println(Dequeue());
               break;
           case "ENQ":
               Enqueue(Integer.parseInt(commands[1]));
               break;
           case "STATE":
               printBuffer();
               break;


       }
   }

    private void printBuffer() {
       int i =0;
       for(var e = startEl; i<bufferSize; e = e.nextEl)    {
           i++;
           if(e.equals(startEl))
               System.out.print("start el:");
           if(e.equals(endEl))
               System.out.print("end el: ");
           System.out.print(e+" ");
       }
        System.out.println();
    }

}