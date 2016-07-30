# Yokohama.groovy で利用するGebハンズオン用プロジェクト

## これは何？

[Yokohama.groovy #42](http://connpass.com/event/33917/)で利用する用のサンプルプロジェクトです。
chromeとphantomJsに対応しています。

## 事前準備

### ドライバーのインストール

利用するブラウザのドライバーが必要な場合があります。

    brew install chromedriver
    brew install phantomjs

### IDEAを使うなら

下記のコマンドで、IntelliJ IDEAのプロジェクトファイルを作成できます。

    ./gradlew idea

## テストの走らせ方

それぞれのブラウザで走らせるには下記のコマンドを実行してください。

    ./gradlew chromeTest
    ./gradlew phantomJsTest

両方のブラウザでテストを実行するなら、下記のコマンドを実行してください。

    ./gradlew test

Windowsの場合、上記の `./gradlew` を `gradlew.bat` に置き換えて実行してください。

## このプロジェクトの元ネタ

[こちら](https://github.com/geb/geb-example-gradle)になります。