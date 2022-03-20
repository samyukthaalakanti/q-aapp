package org.app.units;

public class Question extends AbstractEntity {

    public java.lang.String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(java.lang.String questionBody) {
        this.questionBody = questionBody;
    }

    private java.lang.String questionBody;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
int id=0;
    @Override
    public void autoGenerateId() {
   int id;
   super.getId();
    }
}
