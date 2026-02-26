 class Student{
    public String name;
    public int rollNo;
    public int marks;

};



public class Array {

    public static void main(String args[]){
        // int arr[][] = new int[3][4];
        // for(int i = 0;i<3;i++){
        //     for(int j = 0;j<4;j++){
        //         arr[i][j] = (int) (Math.random() * 100);
        //         System.out.println(arr[i][j]);
        //     }
        // }
        // // ----->Enhanced loop
        // for(int temp[] : arr){
        //     for(int i : temp){
        //         System.out.println(i);
        //     }
        // }


        Student s1 = new Student();
            s1.name = "Ritvik";
            s1.rollNo = 21;
            s1.marks = 97;
        Student s2 = new Student();
            s2.name = "Rupam";
            s2.rollNo = 22;
            s2.marks = 98;

        //  ---> Student array creation
            Student students[] = new Student[2];
                students[0] = s1;
                students[1] = s2;
            
            for(int i = 0;i<students.length;i++){
                System.out.println(students[i].name+ " "+ students[i].rollNo +" " +students[i].marks);
            }
        // String Buffer
            StringBuffer sb = new StringBuffer("Ritvik");
            sb.append(" Bharti");
            System.out.println(sb);
            
    }
}
