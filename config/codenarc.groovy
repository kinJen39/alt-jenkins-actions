ruleset {
    description 'CodeNarc Project RuleSet'

    EmptyMethod
    ImplicitReturnStatement
    PublicMethodsBeforeNonPublicMethods
    MissingNewInThrowStatement
    LineLength {
        length = 200
    }
    SpaceAroundMapEntryColon {
        characterAfterColonRegex = /\s/
    }
    UnnecessaryElseStatement
    UnusedMethodParameter
}
