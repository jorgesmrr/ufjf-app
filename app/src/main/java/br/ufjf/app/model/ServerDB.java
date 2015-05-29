package br.ufjf.app.model;

/**
 * Created by Jorge Augusto da Silva Moreira on 20/05/2015.
 */
public class ServerDB {
    public interface QuestionType {
        int SIMPLE = 0;
        int CHOICE = 1;
        int SCALE = 2;
    }

    public interface SurveyVisibility {
        int CLASS = 0;
        int SUBJECT = 1;
        int COURSE = 2;
        int DEPARTMENT = 3;
        int PUBLIC = 4;
    }

    public interface Survey {
        String ID = "_id";
        String TITLE = "title";
        String DESCRIPTION = "description";
        String QUESTIONS = "questions";
        String VISIBILITY = "visibility";

        interface Question {
            String TITLE = "title";
            String TYPE = "type";

            String SINGLE_LINE = "single_line";

            String OPTIONS = "options";

            String SINGLE_CHOICE = "single_choice";

            String MIN = "min";
            String MAX = "max";
        }

        interface Visibility {
            String TYPE = "type_";
        }
    }
}
