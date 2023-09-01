import java.util.ArrayList;

/**
 * A SlackUser that has a full name, display name, and a list of team members
 * 
 * @author wradkiewicz
 */
class SlackUser {
    private String fullName, displayName;
    private ArrayList<SlackUser> teamMembers;

    public class NameException extends Exception {}

    /**
     * Creates a new slack user.
     * 
     * @param fullName The full name of the slack user
     * @param displayName The display name of the slack user
     * @throws SlackUser.NameException
     */
    public SlackUser(String fullName, String displayName) throws SlackUser.NameException {
        setFullName(fullName);
        setDisplayName(displayName);
        teamMembers = new ArrayList<SlackUser>();
    }

    /**
     * Get the full name of the slack user
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of this user. Must be "First Last", otherwise a
     * SlackUserNameException will be thrown.
     * If null is passed in, the name is set to an empty string.
     * 
     * @param fullName The full name to use.
     * @throws SlackUser.NameException
     */
    public void setFullName(String fullName) throws SlackUser.NameException {
        if (fullName == null) this.fullName = "";
        if (fullName.split("[ \t]").length != 2) {
            throw new NameException();
        }
        this.fullName = fullName;
    }

    /**
     * Get the display name of the slack user
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the display name of this user.
     * If null is passed in, the name is set to an empty string.
     * 
     * @param displayName The display name to use.
     */
    public void setDisplayName(String displayName) {
        if (displayName == null) this.displayName = "";
        else this.displayName = displayName;
    }

    /**
     * Adds a team member to this Slack User's list of team members.
     * If null is passed in, or the current team member,
     * the method doesn't add the member.
     * 
     * @param member The team member to add
     */
    public void addTeamMember(SlackUser member) {
        if (member == null || member == this) return;
        teamMembers.add(member);
    }

    public static void main(String[] args) {
        try {
            SlackUser wyatt = new SlackUser("Wyatt Radkiewicz", "wradkiewicz");
            SlackUser linus = new SlackUser("Linus Torvalds", "ThePenguin");
            wyatt.addTeamMember(linus);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
