package Dictionary_English_and_VN;

public abstract class WordModifier {
    protected Dictionary dictionary;

    public WordModifier(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public abstract void modifyWord(Word word);

    public void execute(String english) {
        Word word = dictionary.findWordByEnglish(english);
        if (word == null) {
            System.out.println("Not found word: " + english);
            return;
        }
        modifyWord(word);
        dictionary.saveDictionary();
        System.out.println("Updated successfully!");
    }
}
