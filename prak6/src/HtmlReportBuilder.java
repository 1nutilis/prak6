public class HtmlReportBuilder implements IReportBuilder{
    private final Report report = new Report();

    public void setHeader(String header) { report.setHeader("<h1>" + header + "</h1>"); }
    public void setContent(String content) { report.setContent("<p>" + content + "</p>"); }
    public void setFooter(String footer) { report.setFooter("<footer>" + footer + "</footer>"); }
    public Report getReport() { return report; }
}
