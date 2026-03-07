public class array {
    public static void main(String[] args) {
        int[] a;
        a=new int[3];
        a[0]=10;
        a[2]=20;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a);
        int[] arr={10,20,30,40,50};
        for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
        int[] arr1={10,20,30,40,50,70};
        int total=0;
        for(Integer i:arr1)
        {
            total=total+i;
        }
        System.out.println("sum of array:" +total);
        int[] array={70,30,20,40,2,100};
        int min=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("min value:" +min);
        int [][]arr2=new int[3][2];
        arr2[0][0]=60;
        arr2[0][1]=40;
        arr2[2][1]=30;
        for(int i=0;i<arr2.length;i++)
            {
                for(int j=0;j<arr2[i].length;j++)
                    {
                        System.out.print(arr2[i][j] +" ");
                    }
                    System.out.println();

                    //1.find the given element index,element=7

                    int[] a1={2,3,4,5,6,7,2,5,8};
                    int element=7;
                    int notfound=10;
                    for( i=0;i<a1.length;i++)
                    {
                        if(a1[i]==element) {
                            notfound=i;
                            break;
                        }          
                    }
                    System.out.println(notfound);
        }
//2.find duplicate element in the array
int[] element={10,20,30,40,20,50,70,10};
for(int i=0;i<element.length;i++){
    for(int j=i+1;j<element.length;j++)
    {
        if(element[i]==element[j])
        {
            System.out.println(element[i]);
            break;
            
        }
    }
}
//3.reverse an array
int[] collections = {40,50,70,10,20,30};

for(int i = collections.length - 1; i >= 0; i--){
    System.out.println(collections[i] + " ");
}

//4.second largest element
int[] arr5={10,20,100,70,50,80};


int largest = arr5[0];
int secondLargest = arr5[0];

for(int i = 1; i < arr5.length; i++) {

    if(arr5[i] > largest) {
        secondLargest = largest;
        largest = arr5[i];
    }
    else if(arr5[i] > secondLargest && arr5[i] != largest) {
        secondLargest = arr5[i];
    }
}

System.out.println("Second Largest: " + secondLargest);

//5.to check the array is sorted
int[] arrs1 = {10,30,40,70,100};

boolean sorted = true;

for(int i = 0; i < arrs1.length - 1; i++) {

    if(arrs1[i] > arrs1[i+1]) {
        sorted = false;
        break;
    }
}

System.out.println(sorted);

//6.remove duplicate from array
int[] array2={1,2,2,3,4,4,5,3};
        System.out.println("Duplicate elements:");

        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[i] == array2[j]) {
                
                    System.out.println(array2[i]);
                }
            }
        }

        //7.rotate array by 1 position
        int[] array3={1,2,3,4,5};
        int first=array3[0];
        for(int i=0;i<array3.length-1;i++)
            {
                array3[i]=array3[i+1];
                System.out.println(array3[i]);
            }
            System.out.println(first);

            //8.which two number to add gives 150 
            int[] array4={10,20,70,60,100,120,30};
        
            for(int i=0;i<array4.length-1;i++)
            {
                for(int j=i+1;j<array4.length;j++){

                    if(array4[i]+array4[j]==150)
                        {
                            System.out.println(array4[i]);
                            System.out.println(array4[j]);
                        }
                    }
            }
//9.find missing number
int[] array5={10,20,30,50,60};

for(int i = 0; i < array5.length-1; i++)
{
    if(array5[i+1] - array5[i] != 10)
    {
        int missing = array5[i] + 10;
        System.out.println("Missing number: " + missing);
    }
}
//10.move all zeros end
int[] array6 = {10,0,5,0,7};

for(int i=0;i<array6.length;i++)
{
    if(array6[i]!=0)
    {
        System.out.print(array6[i] + " ");
    }
}

for(int i=0;i<array6.length;i++)
{
    if(array6[i]==0)
    {
        System.out.print(array6[i] + " ");
    }
}

    }
}

