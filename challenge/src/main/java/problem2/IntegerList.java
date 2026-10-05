package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numberOfElements=0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numberOfElements=size;
    }
    public void increaseSize(){
        int[] newList= new int[list.length*2];
        for (int i=0;i<list.length;i++){
            newList[i]=list[i];
        }
        list=newList;
    }
    public void addElement(int newVal){
        if (list.length==numberOfElements){
            increaseSize();
        }
        list[numberOfElements]=newVal;
        numberOfElements++;
    }
    public void removeFirst(int newVal){
        for (int i=0;i<numberOfElements;i++){
                if (list[i]==newVal){
                    for (int j=i;j<numberOfElements-1;j++){
                        list[j]=list[j+1];
                    }
                    numberOfElements--;
                    break;
                }
        }
    }
    public void removeAll(int newVal){
        for (int i=0;i<numberOfElements;i++){
            if (list[i]==newVal){
                for (int j=i;j<numberOfElements-1;j++){
                    list[j]=list[j+1];
                }
                numberOfElements--;
                i--;
            }
        }
    }


    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<numberOfElements; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numberOfElements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
}