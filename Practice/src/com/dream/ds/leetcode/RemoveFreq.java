class Solution {
     public boolean equalFrequency(String word) {
        // Frequency array to hold the count of each character in the word
        int[] freq = new int[26];

        // Count the frequency of each character in the word
        for (int i = 0; i < word.length(); ++i) {
            freq[word.charAt(i) - 'a']++;
        }

        // Iterate through each character in the alphabet
        for (int i = 0; i < 26; ++i) {
            // If the current character is present in the word
            if (freq[i] > 0) {
                // Decrease the frequency of the character by 1
                freq[i]--;

                int targetFreq = 0; // The target frequency all characters should have
                boolean isValid = true; // Flag to check if the current modification leads to equal frequencies

                // Check if after removing one character, the rest have the same frequency
                for (int v : freq) {
                    if (v == 0) {
                        continue; // Skip if the character is not in the word
                    }
                    if (targetFreq > 0 && v != targetFreq) {
                        isValid = false; // Frequencies differ, set flag to false
                        break;
                    }
                    targetFreq = v; // Set the current frequency as the target for others to match
                }

                // If removing one occurrence of this character results in all other characters having the same frequency
                if (isValid) {
                    return true;
                }

                // Undo the frequency change as we move on to the next character
                freq[i]++;
            }
        }

        // If no single removal leads to equal frequencies, return false
        return false;
    }
}
