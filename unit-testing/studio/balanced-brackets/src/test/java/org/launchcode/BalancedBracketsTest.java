package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    //True = [], LaunchCode [], []LaunchCode, Launch[Code], [[[]]],
    //False = ][, LaunchCode ][, ][LaunchCode, Launch]Code[, ]]][[[

    @Test
    public void onlyBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void doubleBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void curlyPlusBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{[]}"));
    }

    @Test
    public void bracketAfterWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void bracketsAroundPartOfWorldReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void missingBracketReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void missingBracketAroundWordReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void missingBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void manyMissingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{{{}}[][["));
    }

    @Test
    public void missingCurlyBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}{"));
    }

    @Test
    public void bracketsSplittingWord(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[]Code"));
    }

    @Test
    public void manyFinishedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{{{}}}"));
    }


}