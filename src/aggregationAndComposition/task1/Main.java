package src.aggregationAndComposition.task1;

public class Main {
    public static void main(String[] args) {
        Sentence sentence1 = new Sentence(new Word("A"), new Word("aa"), new Word("aaa"), new Word("aaaa"), new Word("aaa"));
        Sentence sentence2 = new Sentence(new Word("B"), new Word("bb"), new Word("bbbbbb"), new Word("bb,"), new Word("b"),
                new Word("bbbbb"), new Word("bb"), new Word("bbb"), new Word("bb,"));
        Sentence sentence3 = new Sentence(new Word("CCCCC"), new Word("c"), new Word("cc"), new Word("cccc"));
        Text text = new Text(sentence1, sentence2);
        text.header("ABC");
        text.printText();
        System.out.println("----------------------------");
        text.addSentence(sentence3);
        text.printText();
    }
}
