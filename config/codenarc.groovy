ruleset {
    description 'CodeNarc Project RuleSet'

    ruleset('rulesets/basic.xml') {
        include 'EmptyMethod'
    }
    ruleset('rulesets/convention.xml'){
        include 'ImplicitReturnStatement'
        include 'PublicMethodsBeforeNonPublicMethods'
    }
    ruleset('rulesets/exceptions.xml') {
        include 'MissingNewInThrowStatement'
    }
    ruleset('rulesets/formatting.xml') {
        LineLength {
            length = 200
        }
        SpaceAroundMapEntryColon {
            characterAfterColonRegex = /\s/
        }
    }
    ruleset('rulesets/unnecessary.xml') {
        include 'UnnecessaryElseStatement'
    }
    ruleset('rulesets/unused.xml') {
        include 'UnusedMethodParameter'
    }
}
