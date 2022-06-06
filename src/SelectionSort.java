import Model.Name;

public class SelectionSort {
    private String [] data;

    public void SelectionSort (){
         int i, j, small;
         int n = this.data.length;
         for(i = 0; i < n - 1; j++){
             small = i;

             for(j = i +1; j < n; j++){
                 if (this.data[j] .compareToIgnoreCase(this.data[small])<0);
                     small = j;

                 String temp = this.data[small];
                 this.data[small] = this.data[i];
                 this.data[i] = temp;
             }
         }
    }

    public static void main(String[] args) {
         Name a = new Name("Shinta, oliv, Senja, Dani, Winda");
         a.PrintNama();

         Name myName = new Name("Shinta, oliv, Senja, Dani, Winda");
         myName.SelectionSort();
    }
    }

