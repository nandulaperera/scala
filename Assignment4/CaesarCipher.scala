object CaesarCipher extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    def encrypt(ptCharacter:Char, key:Int, alphabet:String) : Char = {

	//If the original (plain text) character is a letter
        if(ptCharacter.isLetter) {

	    //Encrypting the character 
            var ctCharacter = alphabet((alphabet.indexOf(ptCharacter.toUpper) + key) % alphabet.size);
	    //If the original (plain text) character is lower case, change the encrypted character to lowercase
            if (ptCharacter.isLower) {
                ctCharacter = ctCharacter.toLower;
            }

	    //Return the cipher text character
            ctCharacter;

        }else{//If the plain textcharacter is not a letter, represent it by a space (' ') character
            ' ';
        }
    };


    def decrypt(ctCharacter:Char, key:Int, alphabet:String) : Char = {

	//If the encrypted (cipher text) character is a letter
        if(ctCharacter.isLetter) {

	    //Calculating the position for obtaining the original (plain text) character 
            var position = alphabet.indexOf(ctCharacter.toUpper) - key;

	    /*If the position of the original character is negative, transform it so that it is a positive value i.e. If the alphabet size is 26 and position is -1, the actual position (index) of the original (plain text) character is 26 + (-1) = 25*/
            if (position < 0) {
                position += alphabet.size;
            }

	    //Obtaining the plain text character
            var ptCharacter = alphabet(position);

            //If the encrypted (cipher text) character is lower case, change the original character to lowercase
	    if (ctCharacter.isLower) {
                ptCharacter = ptCharacter.toLower;
            }

	    //Return the plain text character
            ptCharacter;

        }else{//If the cipher textcharacter is not a letter, represent it by a space (' ') character
            ' ';
        }
    };

    val cipher = (algorithm:(Char,Int,String) => Char,string:String,key:Int,alphabet:String) => string.map(algorithm(_,key,alphabet));

    val string = "The quick Brown Fox jumps over the Lazy Dog";

    val key = 23;

    val cipherText = cipher(encrypt,string,key,alphabet);

    val decryptedText = cipher(decrypt,cipherText,key,alphabet);

    println("Original string : " + string);
    println("Encrypted Text (Cipher Text) : " + cipherText);
    println("Decrypted Text (Plain Text) : " + decryptedText);

}
