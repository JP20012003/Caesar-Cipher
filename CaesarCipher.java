class CaesarCipher {
public static String encode(String enc, int offset) {
offset = offset % 26 + 26;
StringBuilder encoded = new StringBuilder();
for (char i : enc.toCharArray()) {
if (Character.isLetter(i)) {
if (Character.isUpperCase(i)) {
encoded.append((char) (&#39;A&#39; + (i - &#39;A&#39; + offset) % 26));
} else {
encoded.append((char) (&#39;a&#39; + (i - &#39;a&#39; + offset) % 26));
}
} else {
encoded.append(i);
}
}
return encoded.toString();
}
public static String decode(String enc, int offset) {
return encode(enc, 26 - offset);
}
public static void main(String[] args) throws java.lang.Exception {
String msg = &quot;Anna University&quot;;
System.out.println(&quot;Simulating Caesar Cipher\n------------------------&quot;);
System.out.println(&quot;Input : &quot; + msg);
System.out.printf(&quot;Encrypted Message : &quot;);
System.out.println(CaesarCipher.encode(msg, 3));
System.out.printf(&quot;Decrypted Message : &quot;);
System.out.println(CaesarCipher.decode(CaesarCipher.encode(msg, 3), 3));
}
}