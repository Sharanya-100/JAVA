public class GradeExam {
    public static void main(String[] args) {
        char[][] ans = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
             {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
           {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
         
       char[]anskey= {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (int i=0;i<ans.length;i++) {

           int correctans=0;
           for(int j=0;j<ans[i].length;j++){
            if(ans[i][j]==anskey[j]){
                correctans++;
            }
           }

           System.out.println("Student\t"+i+"s"+"\tcorrect ans count is:\t"+correctans);

        }

    }
}
