package pl.lotto;

class ValidationResult {

    String resultMessage;
    boolean valid;
    String additionalInfo;

    ValidationResult(String resultMessage, boolean valid) {
        this.resultMessage = resultMessage;
        this.valid = valid;
    }

    public boolean isValid(){
        return resultMessage.equals("not error");
    }
}
