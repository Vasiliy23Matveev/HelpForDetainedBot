public class Message {
    private long chat_id;
    private String text;
    private String uresname;


    public Message(long chat_id, String text, String uresname) {
        this.chat_id = chat_id;
        this.text = text;
        this.uresname = uresname;

    }

    public long getChat_id() {
        return chat_id;
    }

    public void setChat_id(long chat_id) {
        this.chat_id = chat_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUresname() {
        return uresname;
    }

    public void setUresname(String uresname) {
        this.uresname = uresname;
    }
}
