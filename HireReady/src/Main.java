public class Main {
    public static void main(String[] args) {
        String candidateName = "Rohan Verma";
        int registrationNumber = 25089;
        String degree = "B.Tech Information Technology";
        int graduationYear = 2026;
        double degreePercentage = 78.4;
        int activeBacklogs = 0;

        int aptitudeCorrectAnswers = 42;
        int aptitudeTotalQuestions = 50;

        int codingTestCasesPassed = 9;
        int codingTotalTestCases = 10;

        int communicationScore = 75;
        boolean projectCompleted = true;
        boolean profileVerified = true;

        double aptitudePercentage = (double) aptitudeCorrectAnswers / aptitudeTotalQuestions * 100;
        double codingPercentage = (double) codingTestCasesPassed / codingTotalTestCases * 100;

        boolean degreeEligible = degreePercentage >= 60.0;
        boolean backlogEligible = activeBacklogs == 0;
        boolean gradYearEligible = (graduationYear == 2025 || graduationYear == 2026 || graduationYear == 2027);
        boolean aptitudeEligible = aptitudePercentage >= 60.0;
        boolean codingEligible = codingPercentage >= 70.0;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean profileEligible = profileVerified;

        boolean allEligible = degreeEligible && backlogEligible && gradYearEligible &&
        aptitudeEligible && codingEligible && communicationEligible &&
        projectEligible && profileEligible;

        String applicationStatus;
        String nextAction;

        if (!degreeEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Improve degree percentage";
        } else if (!backlogEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Clear active backlogs";
        } else if (!gradYearEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Check graduation-year criteria";
        } else if (!aptitudeEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Improve aptitude performance";
        } else if (!codingEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Improve coding performance";
        } else if (!communicationEligible) {
            applicationStatus = "Not Eligible";
            nextAction = "Improve communication";
        } else if (!projectEligible) {
            applicationStatus = "Application On Hold";
            nextAction = "Complete the project";
        } else if (!profileEligible) {
            applicationStatus = "Application On Hold";
            nextAction = "Complete profile verification";
        } else {
            applicationStatus = "Eligible to Apply";
            nextAction = "Submit the company application";
        }

        System.out.println("        CAMPUS PLACEMENT APPLICATION REPORT      ");

        System.out.println("Candidate Name          : " + candidateName);
        System.out.println("Registration Number     : " + registrationNumber);
        System.out.println("Degree                  : " + degree);
        System.out.println("Graduation Year         : " + graduationYear);
        System.out.println("Degree Percentage       : " + degreePercentage);
        System.out.println("Active Backlogs         : " + activeBacklogs);

        System.out.println("Aptitude Score          : " + aptitudeCorrectAnswers + " / " + aptitudeTotalQuestions);
        System.out.println("Aptitude Percentage     : " + aptitudePercentage);
        System.out.println("Coding Test Cases       : " + codingTestCasesPassed + " / " + codingTotalTestCases);
        System.out.println("Coding Percentage       : " + codingPercentage);
        System.out.println("Communication Score     : " + communicationScore);
        System.out.println("Project Completed       : " + (projectCompleted ? "Yes" : "No"));
        System.out.println("Profile Verified        : " + (profileVerified ? "Yes" : "No"));

        System.out.println("Degree Eligibility      : " + (degreeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Backlog Eligibility     : " + (backlogEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Graduation Year         : " + (gradYearEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Aptitude Eligibility    : " + (aptitudeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Coding Eligibility      : " + (codingEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Communication Status    : " + (communicationEligible ? "Eligible" : "Not Eligible"));

        System.out.println("Application Status      : " + applicationStatus);
        System.out.println("Next Action             : " + nextAction);

    }
}
