#include <stdio.h>
#include <string.h>
#include <ctype.h>

int check_anagram(char a[], char b[]) {
    int first[26] = {0}, second[26] = {0}, c = 0;

    // Calculating frequency of characters of the first string
    while (a[c] != '\0') {
        if (isalpha(a[c])) {
            first[tolower(a[c]) - 'a']++;
        }
        c++;
    }

    c = 0;

    // Calculating frequency of characters of the second string
    while (b[c] != '\0') {
        if (isalpha(b[c])) {
            second[tolower(b[c]) - 'a']++;
        }
        c++;
    }

    // Comparing frequency of characters
    for (c = 0; c < 26; c++) {
        if (first[c] != second[c])
            return 0;
    }

    return 1;
}

int main() {
    char a[100], b[100];

    printf("Enter first string: ");
    scanf("%s", a);

    printf("Enter second string: ");
    scanf("%s", b);

    if (check_anagram(a, b))
        printf("The strings are anagrams.\n");
    else
        printf("The strings are not anagrams.\n");

    return 0;
}
