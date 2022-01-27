import java.util.Random;

public class WhiteCard {

    public static void WhiteCard() {

        System.out.println("Beyaz kartlarnız hazırlanıyor.");
        String WhiteCards[] = new String[30];
        WhiteCards[0] = "0.At TEDU";
        WhiteCards[1] = "1.How bright the sun is";
        WhiteCards[2] = "2.Duel middle of the bus";
        WhiteCards[3] = "3.Weird mannequin";
        WhiteCards[4] = "4.A man who is lying with his heart";
        WhiteCards[5] = "5.Ottoman Empire";
        WhiteCards[6] = "6.Hitler";
        WhiteCards[7] = "7.Horse shaped aliens";
        WhiteCards[8] = "8.Greek Gods";
        WhiteCards[9] = "9.Celebrity";
        WhiteCards[10] = "10.Oujia board";
        WhiteCards[11] = "11.Energy drink";
        WhiteCards[12] = "12.Every bone in our body";
        WhiteCards[13] = "13.The person nobody likes.";
        WhiteCards[14] = "14.When your favorite song started to play";
        WhiteCards[15] = "15.Slavery";
        WhiteCards[16] = "16.Graveyard";
        WhiteCards[17] = "17.Having a heart attack";
        WhiteCards[18] = "18.The world's ugliest fish";
        WhiteCards[19] = "19.Bunch of apples";
        WhiteCards[20] = "20.Robots who want to kill you";
        WhiteCards[21] = "21.Making friends";
        WhiteCards[22] = "22.A loser";
        WhiteCards[23] = "23.Superhero out of the world";
        WhiteCards[24] = "24.Bohemian Rhapsody ";
        WhiteCards[25] = "25.You";
        WhiteCards[26] = "26.Boogie Man";
        WhiteCards[27] = "27.Batman";
        WhiteCards[28] = "28.Smelling dirty socks ";
        WhiteCards[29] = "29.Dancing with SpongeBob";

        //Her user için for döngüsü  yapılabilir.bir kişi hakem olacak toplamda 20 kere kart çekilmesi lazım ve aynı kartlar üst üste gelmemeli inheritance bağlantıları yapılmalı her raund için bu işlemler tekrar uygulamalı,Skor tablosu,hakemin puan verme.
        for (int i = 0; i <= 4; i++) {


            Random random = new Random();
            int randomwhitecard = random.nextInt(WhiteCards.length);
            System.out.println(WhiteCards[randomwhitecard]);


        }
        System.out.println("--------------------------------------");
    }
}