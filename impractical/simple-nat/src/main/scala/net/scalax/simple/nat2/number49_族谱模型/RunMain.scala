package net.scalax.simple
package nat
package number49

import javax.swing.JOptionPane

object RunTest1 {

  def main1(arr: Array[String]): Unit = {

    val zu: Number49.In = Number49.InZero

    zu.name = Some("爷爷")
    zu.out().name = Some("奶奶")
    zu.out().in().name = Some("大伯")
    zu.out().in().out().name = Some("大母")

    zu.out().in().out().in().name = Some("大堂哥")
    zu.out().in().out().in().out().name = Some("大嫂")
    zu.out().in().out().in().out().in().name = Some("大侄女")
    zu.out().in().out().in().out().in().in().name = Some("三侄女")

    zu.out().in().out().in().in().name = Some("大堂姐")
    zu.out().in().out().in().in().out().name = Some("大堂姐（外嫁女）")
    zu.out().in().out().in().in().out().in().name = Some("表侄女")
    zu.out().in().out().in().in().out().in().in().name = Some("表侄子")

    zu.out().in().out().in().in().in().name = Some("二堂哥")
    zu.out().in().out().in().in().in().out().name = Some("二嫂")
    zu.out().in().out().in().in().in().out().in().name = Some("二侄女")
    zu.out().in().out().in().in().in().out().in().in().name = Some("大侄子")

    zu.out().in().in().name = Some("大姑")
    zu.out().in().in().out().name = Some("大姑（外嫁女）")
    zu.out().in().in().out().in().name = Some("大表姐")
    zu.out().in().in().out().in().out().name = Some("大表姐（外嫁女）")
    zu.out().in().in().out().in().in().name = Some("大表哥")
    zu.out().in().in().out().in().in().in().name = Some("二表姐")
    zu.out().in().in().out().in().in().in().out().name = Some("二表姐（外嫁女）")

    zu.out().in().in().in().name = Some("二伯")
    zu.out().in().in().in().out().name = Some("二母")

    zu.out().in().in().in().out().in().name = Some("三堂哥")
    zu.out().in().in().in().out().in().out().name = Some("三嫂")
    zu.out().in().in().in().out().in().out().in().name = Some("二侄子")
    zu.out().in().in().in().out().in().out().in().in().name = Some("三侄子")

    zu.out().in().in().in().in().name = Some("爹")
    zu.out().in().in().in().in().out().name = Some("母亲")
    zu.out().in().in().in().in().out().in().name = Some("我")

    JOptionPane.showMessageDialog(null, zu.toString)

  }

}
