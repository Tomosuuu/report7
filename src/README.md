- 概要説明
　このゲームは、「ポーカー」です。
　Main.javaを実行すると、MasterとPlayerの手札とそれぞれの役、
勝敗が表示されます。
　配られたカードを交換することは、まだできていません。

・Main.java
 - MasterクラスとPlayerクラスを実行します。
 - 勝敗が表示されます。　

・Cardstock.java
 - 山札を用意し、シャッフルした後にMasterとPlayerの手札を作ります。

・Game.java
 - Cardstock.javaを継承しています。
 - 手札を見て、役の判断をします。

・Player.java / Master.java
 - Game.javaを継承しています。
 - Cardstockにあるメソッドと、Gameにあるメソッドを実行します。