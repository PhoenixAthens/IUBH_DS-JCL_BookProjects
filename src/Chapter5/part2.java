package Unit_5;

public class part2 {
    public static void main(String...args){
        StringBuffer buff=new StringBuffer("Hello world!");
        buff.ensureCapacity(250);//this way you set the capacity of the string's buffer to begin with
        //as a result your buffer capacity will not be filled with extra spaces to a maxed out length.
        // the buffer capacity always doubles when you exceed the length of buffer;
        System.out.println("Beginning cap: "+buff.capacity());
        System.out.println("Beginning length: "+buff.length());
        buff.append(", Lorem Ipsum");
        System.out.println("2ns cap: "+buff.capacity());
        System.out.println("2ns length: "+buff.length());
        System.out.println(buff);
        buff.append(", Oopsie doopsie");
        System.out.println("3rd cap: "+buff.capacity());
        System.out.println("3rd length: "+buff.length());
        System.out.println(buff);
        buff.append(", poopy gloria");
        System.out.println("4th cap: "+buff.capacity());
        System.out.println("4th length: "+buff.length());
        System.out.println(buff);
        buff.append(", happy hours");
        System.out.println("5th cap: "+buff.capacity());
        System.out.println("5th length: "+buff.length());
        System.out.println(buff);
        buff.append(", free sodas and pie");
        System.out.println("6th cap: "+buff.capacity());
        System.out.println("6th length: "+buff.length());
        System.out.println(buff);
        buff.append(", we are behind and we have to get done!");
        System.out.println("7th cap: "+buff.capacity());
        System.out.println("7th length: "+buff.length());
        System.out.println(buff);
        buff.append(buff);
        System.out.println("8th cap: "+buff.capacity());
        System.out.println("8th length: "+buff.length());
        System.out.println(buff);
        //buff.trimToSize();//this made the capacity equal to length
        //buff.setLength(100);//this trimmed the string to length equivalent to the specified parameter;
        System.out.println("9th cap: "+buff.capacity());
        System.out.println("9th length: "+buff.length());
        System.out.println(buff);
        /*System.out.println("Capacity: "+buff.capacity());
        System.out.println("Length: "+buff.length());
        int j=buff.capacity();
        //System.out.println("Char at("+j+"): "+buff.charAt(j));
        System.out.println(buff.codePointAt(buff.length()-1));*/
        StringBuffer huff=new StringBuffer();
        //System.out.println(huff);
        System.out.println("1st cap: "+huff.capacity());
        System.out.println("1st length: "+huff.length());
        System.out.println(huff);
        huff.append("Relax");
        System.out.println(huff);
        //System.out.println(huff.charAt(6));
        char[] newArray=new char[]{'a','b','c','d','e','f'};
        huff.append(newArray,0,newArray.length-2);
        //this method is exclusive of the end index
        System.out.println("2nd cap: "+huff.capacity());
        System.out.println("2ns length: "+huff.length());
        System.out.println(huff);
        huff.append("ozymandias",0,5);//this appends the character of entered string
        // from 0 till index (exclusive) 5
        System.out.println("3rd cap: "+huff.capacity());
        System.out.println("3rd length: "+huff.length());
        System.out.println(huff);
        System.out.println(huff.codePointAt(3));//gives the unicode decimal value of the character at index in String
        System.out.println(huff.codePointBefore(3));
        huff.delete(4,8);
        System.out.println(huff);
        huff.deleteCharAt(5);
        System.out.println(huff);
        huff.insert(2,new char[]{'b','a','t','m','a','n'});
        System.out.println(huff);
        huff.setCharAt(0,'G');
        System.out.println(huff);
        huff.replace(1,10,"finnese");
        System.out.println(huff);
        System.out.println(huff.subSequence(3,8).getClass().getSimpleName());
        System.out.println("substring: "+huff.substring(3,8));
        System.out.println();
        huff.insert(0,newArray,0,3);//index is the insert index for huff, offset is the start index
        //for charArray, len is the end index for char array, like here it means insert into huff, at index 0, characters
        //0 to 3(exclusive) from newArray
        System.out.println(huff);
        System.out.println(huff.indexOf("dz"));
        System.out.println(huff.indexOf("dz",4));
        huff.reverse();
        System.out.println(huff);



    }
}
