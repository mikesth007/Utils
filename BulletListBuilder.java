public class BulletListBuilder {

    private static final String SPACE = " ";
    private static final String BULLET_SYMBOL = "&#8226";
    private static final String EOL = System.getProperty("line.separator");
    private static final String TAB = "\t";

    private BulletListBuilder() {

    }

    public static String getBulletList(String header, String []items) {
        StringBuilder listBuilder = new StringBuilder();
        if (header != null && !header.isEmpty()) {
            listBuilder.append(header + EOL + EOL);
        }
        if (items != null && items.length != 0) {
            for (String item : items) {
                Spanned formattedItem = Html.fromHtml(BULLET_SYMBOL + SPACE + item);
                listBuilder.append(TAB + formattedItem + EOL);
            }
        }
        return listBuilder.toString();
    }

}
