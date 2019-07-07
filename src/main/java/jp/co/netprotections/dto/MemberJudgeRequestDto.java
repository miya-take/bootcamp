package jp.co.netprotections.dto;


/**
 * @author t.miyazawa
 * @
 */
public class MemberJudgeRequestDto {
  private String memberName;
  private int eventPlanning;
  private int cogitation;
  private int coodination;
  private int programmingAbility;
  private int infrastructureKnowledge;

  public MemberJudgeRequestDto(
      String memberName,
      int eventPlanning,
      int cogitation,
      int coodination,
      int programmingAbility,
      int infrastructureKnowledge
  ) {
    this.memberName = memberName;
    this.eventPlanning = eventPlanning;
    this.cogitation = cogitation;
    this.coodination = coodination;
    this.programmingAbility = programmingAbility;
    this.infrastructureKnowledge = infrastructureKnowledge;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public int getEventPlanning() {
    return eventPlanning;
  }

  public void setEventPlanning(int eventPlanning) {
    this.eventPlanning = eventPlanning;
  }

  public int getCogitation() {
    return cogitation;
  }

  public void setCogitation(int cogitation) {
    this.cogitation = cogitation;
  }

  public int getCoodination() {
    return coodination;
  }

  public void setCoodination(int coodination) {
    this.coodination = coodination;
  }

  public int getProgrammingAbility() {
    return programmingAbility;
  }

  public void setProgrammingAbility(int programmingAbility) {
    this.programmingAbility = programmingAbility;
  }

  public int getInfrastructureKnowledge() {
    return infrastructureKnowledge;
  }

  public void setInfrastructureKnowledge(int infrastructureKnowledge) {
    this.infrastructureKnowledge = infrastructureKnowledge;
  }

}