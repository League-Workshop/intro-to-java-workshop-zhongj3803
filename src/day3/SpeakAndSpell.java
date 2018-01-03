package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("Spell Mississippi");
		// 2. Catch the user's answer in a String
String answer=JOptionPane.showInputDialog("Please type here");
		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Mississippi"))
	speak("correct");
		// 4. Otherwise say "wrong"
else
	speak("wrong");
		// 5. repeat the process for other words

speak("Spell Grotesque");
// 2. Catch the user's answer in a String
 answer=JOptionPane.showInputDialog("Please type here");
// 3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Grotesque"))
speak("correct");
// 4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Hippopotamus");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Hippopotamus"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Incinerated");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Incinerated"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Background");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Background"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Receipt");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Receipt"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Conscious");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Conscious"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Righteousness");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Righteousness"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Argumentative");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Argumentative"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Propaganda");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Propaganda"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Pronunciation");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Pronunciation"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");

speak("Spell Serrated");
//2. Catch the user's answer in a String
answer=JOptionPane.showInputDialog("Please type here");
//3. If the user spelled the word correctly, speak "correct"
if(answer.equals("Serrated"))
speak("correct");
//4. Otherwise say "wrong"
else
speak("wrong");


		
	}

	static void speak(String words) {
		try {
		Runtime.getRuntime().exec("say "+ words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}




