package kadai_018;

public abstract class Kato_Chapter18 {

    public String familyName = "加藤";
    public String givenName = "太郎";
    public String address = "東京都中野区〇×";

    public void commonIntroduce() {
        System.out.println("名前は" + familyName + " " + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    abstract public void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}