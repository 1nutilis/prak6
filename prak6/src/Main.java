public class Main {
    public static void main(String[] args) {

        IReportBuilder textBuilder = new TextReportBuilder();
        ReportDirector director = new ReportDirector();
        director.constructReport(textBuilder);
        Report textReport = textBuilder.getReport();
        System.out.println("Текстовый отчет:\n" + textReport);


        IReportBuilder htmlBuilder = new HtmlReportBuilder();
        director.constructReport(htmlBuilder);
        Report htmlReport = htmlBuilder.getReport();
        System.out.println("\nHTML-отчет:\n" + htmlReport);
    }
}