package Dictionary_English_and_VN;

public abstract class FranceWordModifier {
    protected DictFranceToVn dictionary;

    public FranceWordModifier(DictFranceToVn dictionary) {
        this.dictionary = dictionary;
    }

    public abstract void modifyFranceWord(FranceWord franceWord);

    public void executeFrance(String france) {
        FranceWord franceWord = dictionary.findWordByFrance(france);
        if (franceWord == null) {
            System.out.println("Not found word: " + france);
            return;
        }
        modifyFranceWord(franceWord);
        dictionary.saveFile();
        System.out.println("Updated successfully!");
    }
}
