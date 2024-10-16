public class ReportDirector {
    public void constructReport(IReportBuilder builder) {
        builder.setHeader("Отчет");
        builder.setContent("Это содержимое отчета");
        builder.setFooter("Конец отчета");
    }
}
