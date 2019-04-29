package Exercise3;

public class GradeRange {
    public static void main(String[] args) {
        int marks=89;
        String grade;
        if(marks>=90 && marks<=100){
        grade="Grade A";
    }
        else if(marks>=70&& marks <=89){
        grade="Grade B";
    }
        else if(marks>=37&& marks<=69){
        grade="Grade C";
    }
        else if (marks==36){
        grade="Grade Pass";
    }
        else if (marks==0&&marks<36){
        grade="Grade Fail";
    }
        else {
        grade="invalid";
    }
        System.out.println(grade);
}
}


