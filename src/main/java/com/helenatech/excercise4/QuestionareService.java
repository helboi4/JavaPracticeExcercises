package com.helenatech.excercise4;

import com.helenatech.excercise3.EmailValidator;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class QuestionareService {
    private Questionare questionare;


    public QuestionareService( Questionare questionare){
        this.questionare = questionare;
    }

    public static void runQuestionare(){
        NameChecker nameChecker = new NameChecker();
        EmailValidator emailValidator = new EmailValidator();
        DateValidatorUsingLocalDate dateValidator;
        dateValidator = new DateValidatorUsingLocalDate(DateTimeFormatter.ofLocalizedDate());
        Scanner participantAnswers = new Scanner(System.in);
        Participant participant = new Participant(null,null, null);
        System.out.println("What is your name? (First name and last name)");
        do{
            String name = participantAnswers.nextLine();
            if (nameChecker.validate(name)){
                participant.setName(name);
                break;
            }else{
                System.out.println("Not a valid name. Please enter your first name and last name.");
            }
        }while(true);

        System.out.println("Please enter your email address.");
        do{
            String email = participantAnswers.nextLine();
            if (emailValidator.validate(email)){
                participant.setEmail(email);
                break;
            }else{
                System.out.println("Not a valid email. Please enter a valid email address.");
            }
        }while(true);


    }
}


