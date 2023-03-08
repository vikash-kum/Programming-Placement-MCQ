package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Questions type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Questions", type = Model.Type.USER, version = 1, authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class Questions implements Model {
  public static final QueryField ID = field("Questions", "id");
  public static final QueryField QUESTION = field("Questions", "question");
  public static final QueryField OPTION1 = field("Questions", "option1");
  public static final QueryField OPTION2 = field("Questions", "option2");
  public static final QueryField OPTION3 = field("Questions", "option3");
  public static final QueryField OPTION4 = field("Questions", "option4");
  public static final QueryField CORRECT_ANS = field("Questions", "correctAns");
  public static final QueryField TOPIC = field("Questions", "topic");
  public static final QueryField SUBJECT = field("Questions", "subject");
  public static final QueryField DESCRIPTION = field("Questions", "description");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String question;
  private final @ModelField(targetType="String", isRequired = true) String option1;
  private final @ModelField(targetType="String", isRequired = true) String option2;
  private final @ModelField(targetType="String", isRequired = true) String option3;
  private final @ModelField(targetType="String", isRequired = true) String option4;
  private final @ModelField(targetType="Int", isRequired = true) Integer correctAns;
  private final @ModelField(targetType="String", isRequired = true) String topic;
  private final @ModelField(targetType="String", isRequired = true) String subject;
  private final @ModelField(targetType="String") String description;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String resolveIdentifier() {
    return id;
  }
  
  public String getId() {
      return id;
  }
  
  public String getQuestion() {
      return question;
  }
  
  public String getOption1() {
      return option1;
  }
  
  public String getOption2() {
      return option2;
  }
  
  public String getOption3() {
      return option3;
  }
  
  public String getOption4() {
      return option4;
  }
  
  public Integer getCorrectAns() {
      return correctAns;
  }
  
  public String getTopic() {
      return topic;
  }
  
  public String getSubject() {
      return subject;
  }
  
  public String getDescription() {
      return description;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Questions(String id, String question, String option1, String option2, String option3, String option4, Integer correctAns, String topic, String subject, String description) {
    this.id = id;
    this.question = question;
    this.option1 = option1;
    this.option2 = option2;
    this.option3 = option3;
    this.option4 = option4;
    this.correctAns = correctAns;
    this.topic = topic;
    this.subject = subject;
    this.description = description;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Questions questions = (Questions) obj;
      return ObjectsCompat.equals(getId(), questions.getId()) &&
              ObjectsCompat.equals(getQuestion(), questions.getQuestion()) &&
              ObjectsCompat.equals(getOption1(), questions.getOption1()) &&
              ObjectsCompat.equals(getOption2(), questions.getOption2()) &&
              ObjectsCompat.equals(getOption3(), questions.getOption3()) &&
              ObjectsCompat.equals(getOption4(), questions.getOption4()) &&
              ObjectsCompat.equals(getCorrectAns(), questions.getCorrectAns()) &&
              ObjectsCompat.equals(getTopic(), questions.getTopic()) &&
              ObjectsCompat.equals(getSubject(), questions.getSubject()) &&
              ObjectsCompat.equals(getDescription(), questions.getDescription()) &&
              ObjectsCompat.equals(getCreatedAt(), questions.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), questions.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getQuestion())
      .append(getOption1())
      .append(getOption2())
      .append(getOption3())
      .append(getOption4())
      .append(getCorrectAns())
      .append(getTopic())
      .append(getSubject())
      .append(getDescription())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Questions {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("question=" + String.valueOf(getQuestion()) + ", ")
      .append("option1=" + String.valueOf(getOption1()) + ", ")
      .append("option2=" + String.valueOf(getOption2()) + ", ")
      .append("option3=" + String.valueOf(getOption3()) + ", ")
      .append("option4=" + String.valueOf(getOption4()) + ", ")
      .append("correctAns=" + String.valueOf(getCorrectAns()) + ", ")
      .append("topic=" + String.valueOf(getTopic()) + ", ")
      .append("subject=" + String.valueOf(getSubject()) + ", ")
      .append("description=" + String.valueOf(getDescription()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static QuestionStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Questions justId(String id) {
    return new Questions(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      question,
      option1,
      option2,
      option3,
      option4,
      correctAns,
      topic,
      subject,
      description);
  }
  public interface QuestionStep {
    Option1Step question(String question);
  }
  

  public interface Option1Step {
    Option2Step option1(String option1);
  }
  

  public interface Option2Step {
    Option3Step option2(String option2);
  }
  

  public interface Option3Step {
    Option4Step option3(String option3);
  }
  

  public interface Option4Step {
    CorrectAnsStep option4(String option4);
  }
  

  public interface CorrectAnsStep {
    TopicStep correctAns(Integer correctAns);
  }
  

  public interface TopicStep {
    SubjectStep topic(String topic);
  }
  

  public interface SubjectStep {
    BuildStep subject(String subject);
  }
  

  public interface BuildStep {
    Questions build();
    BuildStep id(String id);
    BuildStep description(String description);
  }
  

  public static class Builder implements QuestionStep, Option1Step, Option2Step, Option3Step, Option4Step, CorrectAnsStep, TopicStep, SubjectStep, BuildStep {
    private String id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private Integer correctAns;
    private String topic;
    private String subject;
    private String description;
    @Override
     public Questions build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Questions(
          id,
          question,
          option1,
          option2,
          option3,
          option4,
          correctAns,
          topic,
          subject,
          description);
    }
    
    @Override
     public Option1Step question(String question) {
        Objects.requireNonNull(question);
        this.question = question;
        return this;
    }
    
    @Override
     public Option2Step option1(String option1) {
        Objects.requireNonNull(option1);
        this.option1 = option1;
        return this;
    }
    
    @Override
     public Option3Step option2(String option2) {
        Objects.requireNonNull(option2);
        this.option2 = option2;
        return this;
    }
    
    @Override
     public Option4Step option3(String option3) {
        Objects.requireNonNull(option3);
        this.option3 = option3;
        return this;
    }
    
    @Override
     public CorrectAnsStep option4(String option4) {
        Objects.requireNonNull(option4);
        this.option4 = option4;
        return this;
    }
    
    @Override
     public TopicStep correctAns(Integer correctAns) {
        Objects.requireNonNull(correctAns);
        this.correctAns = correctAns;
        return this;
    }
    
    @Override
     public SubjectStep topic(String topic) {
        Objects.requireNonNull(topic);
        this.topic = topic;
        return this;
    }
    
    @Override
     public BuildStep subject(String subject) {
        Objects.requireNonNull(subject);
        this.subject = subject;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String question, String option1, String option2, String option3, String option4, Integer correctAns, String topic, String subject, String description) {
      super.id(id);
      super.question(question)
        .option1(option1)
        .option2(option2)
        .option3(option3)
        .option4(option4)
        .correctAns(correctAns)
        .topic(topic)
        .subject(subject)
        .description(description);
    }
    
    @Override
     public CopyOfBuilder question(String question) {
      return (CopyOfBuilder) super.question(question);
    }
    
    @Override
     public CopyOfBuilder option1(String option1) {
      return (CopyOfBuilder) super.option1(option1);
    }
    
    @Override
     public CopyOfBuilder option2(String option2) {
      return (CopyOfBuilder) super.option2(option2);
    }
    
    @Override
     public CopyOfBuilder option3(String option3) {
      return (CopyOfBuilder) super.option3(option3);
    }
    
    @Override
     public CopyOfBuilder option4(String option4) {
      return (CopyOfBuilder) super.option4(option4);
    }
    
    @Override
     public CopyOfBuilder correctAns(Integer correctAns) {
      return (CopyOfBuilder) super.correctAns(correctAns);
    }
    
    @Override
     public CopyOfBuilder topic(String topic) {
      return (CopyOfBuilder) super.topic(topic);
    }
    
    @Override
     public CopyOfBuilder subject(String subject) {
      return (CopyOfBuilder) super.subject(subject);
    }
    
    @Override
     public CopyOfBuilder description(String description) {
      return (CopyOfBuilder) super.description(description);
    }
  }
  
}
