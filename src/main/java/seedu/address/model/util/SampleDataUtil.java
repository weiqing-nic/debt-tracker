package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.FinancialDatabase;
import seedu.address.model.ReadOnlyFinancialDatabase;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.UniqueId;
import seedu.address.model.tag.Tag;
import seedu.address.model.transaction.Amount;
import seedu.address.model.transaction.Deadline;
import seedu.address.model.transaction.Transaction;
import seedu.address.model.transaction.Type;

/**
 * Contains utility methods for populating {@code DebtTracker} with sample data.
 */
public class SampleDataUtil {
    public static seedu.address.model.transaction.Transaction[] getSampleTransactions() {
        return new seedu.address.model.transaction.Transaction[]{
            new Transaction(new Type("debt"), new Amount("SGD 33.00"), new Deadline("15/12/2018"),
                    new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                            new Address("Blk 30 Geylang Street 29, #06-40"), getTagSet("friends"))),
            new Transaction(new Type("loan"), new Amount("SGD 55.50"), new Deadline("17/11/2018"),
                    new Person(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                    new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), getTagSet("colleagues", "friends")))
        };
    }

    public static ReadOnlyFinancialDatabase getSampleFinancialDatabase() {
        FinancialDatabase sampleFd = new FinancialDatabase();
        for (seedu.address.model.transaction.Transaction sampleTransaction : getSampleTransactions()) {
            sampleFd.addTransaction(sampleTransaction);
        }
        return sampleFd;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
