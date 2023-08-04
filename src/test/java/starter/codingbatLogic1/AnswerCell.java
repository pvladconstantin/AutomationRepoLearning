package starter.codingbatLogic1;

import org.mockito.stubbing.Answer;

public class AnswerCell {

    //Your cell phone rings. Return true if you should answer it.
    //Normally you answer, except in the morning you only answer if it is your mom calling.
    //In all cases, if you are asleep, you do not answer.
    boolean isMorning = false   ;
    boolean isMom = false;
    boolean isAsleep;

    public boolean Method() {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !isMom) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        AnswerCell execute = new AnswerCell();
        System.out.println(execute.Method());
    }
}

