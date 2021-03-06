package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {
    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_TAG = new Prefix("t/");
    public static final Prefix PREFIX_PERSONID = new Prefix("id/");
    public static final Prefix PREFIX_TRANSACTION_AMOUNT = new Prefix("ta/");
    public static final Prefix PREFIX_TRANSACTION_TYPE = new Prefix("tt/");
    public static final Prefix PREFIX_TO_DO_LIST = new Prefix("toDo/");
    public static final Prefix PREFIX_TRANSACTION_DEADLINE = new Prefix("d/");
}
