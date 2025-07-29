#include <stdio.h>

int isVowel(char ch) {
    // Check for vowels
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

void modifyString(char S[]) {
    for (int i = 0; S[i]; i++) {
        if (!isVowel(S[i])) {
            S[i] = 'a'; // Replace consonants with smallest vowel
        }
    }
    printf("%s", S); // Output the result
}

int main() {
    char S[101]; // Support up to 100 characters + null terminator
    scanf("%100s", S); // Safe input
    modifyString(S);
    return 0;
}
