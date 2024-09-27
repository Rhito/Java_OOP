package bai09;

public class Magazine extends Publication{
    private String issue;

    public Magazine() {}
    public Magazine(String title, double price, String issue) {
        super(title, price);
        this.issue = issue;
    }
    public String getIssue() {
        return issue;
    }
    public void setIssue(String issue) {
        this.issue = issue;
    }
    @Override
    public void output() {
        super.output();
        System.out.println("Issue: " + issue);
    }
}
