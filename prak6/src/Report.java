
public class Report {
    private String header;
    private String content;
    private String footer;

    public void setHeader(String header) { this.header = header; }
    public void setContent(String content) { this.content = content; }
    public void setFooter(String footer) { this.footer = footer; }

    @Override
    public String toString() {
        return "Заголовок: " + header + "\nСодержимое: " + content + "\nПодвал: " + footer;
    }
}