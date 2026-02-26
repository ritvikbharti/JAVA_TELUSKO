import java.util.Scanner;

public class QuestionService {
        Question[] questions = new Question[5];
        String selection[] = new String[5];
        public QuestionService() {
            questions[0] = new Question(1, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
            questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
            questions[2] = new Question(3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
            questions[3] = new Question(4, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Pb", "Au");
            questions[4] = new Question(5, "Who painted the Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Claude Monet", "Leonardo da Vinci");
        }


        public void playQuiz(){
           System.out.println("Welcome to the Quiz!");
           System.out.println("Please answer the following questions:");
           int i = 0;
           for(Question q : questions){
               System.out.println(q.getQuestion());
               System.out.println("1. " + q.getOption1());
               System.out.println("2. " + q.getOption2());
               System.out.println("3. " + q.getOption3());
               System.out.println("4. " + q.getOption4());
               Scanner sc = new Scanner(System.in);
               selection[i] =  sc.nextLine();
               i++;
           }

           for(String s : selection){
               System.out.println(s);
           }

        }
        public void calculateScore(){
            int score = 0;
            for(int i = 0; i < questions.length; i++){
                if(selection[i].equals(questions[i].getAnswer())){
                    score++;
                }
            }
            System.out.println("Your score is: " + score + "/" + questions.length);
        }
}
