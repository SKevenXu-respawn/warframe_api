package program.ORC;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class get_orc_data {
    demo demo;

    public void getdata(String text) {
        Gson gson = new Gson();
        demo = gson.fromJson(text, demo.class);

        System.out.println(demo.ParsedResults.get(0).ParsedText);

    }

    public String[] getText() {
        String[] text = new String[demo.ParsedResults.size()];
        for (int i = 0; i < text.length; i++) {
            text[i] = demo.ParsedResults.get(i).ParsedText;
        }
        return text;
    }

    public String[] getProcessing() {
        String[] text = new String[2];

        text[0] = String.valueOf(demo.IsErroredOnProcessing);
        text[1] = demo.ProcessingTimeInMilliseconds;

        return text;
    }

    public String[] gettext_pro() {
        String temp[] = demo.ParsedResults.get(0).ParsedText.split("\n");
        return temp;
    }

}

class demo {
    List<ParsedResults> ParsedResults;
    int OCRExitCode;
    boolean IsErroredOnProcessing;
    String ProcessingTimeInMilliseconds;

    public List<ParsedResults> getParsedResults() {
        return ParsedResults;
    }

    public void setParsedResults(List<ParsedResults> parsedResults) {
        ParsedResults = parsedResults;
    }

    public String getProcessingTimeInMilliseconds() {
        return ProcessingTimeInMilliseconds;
    }

    public int getOCRExitCode() {
        return OCRExitCode;
    }

    public void setIsErroredOnProcessing(boolean isErroredOnProcessing) {
        IsErroredOnProcessing = isErroredOnProcessing;
    }

    public void setOCRExitCode(int oCRExitCode) {
        OCRExitCode = oCRExitCode;
    }

    public void setProcessingTimeInMilliseconds(String processingTimeInMilliseconds) {
        ProcessingTimeInMilliseconds = processingTimeInMilliseconds;
    }

    public boolean getIsErroredOnProcessing() {
        return IsErroredOnProcessing;
    }
}

class ParsedResults {
    JsonObject TextOverlay;
    String TextOrientation;
    int FileParseExitCode;
    String ParsedText;
    String ErrorMessage;
    String ErrorDetails;

    public String getErrorDetails() {
        return ErrorDetails;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public int getFileParseExitCode() {
        return FileParseExitCode;
    }

    public String getParsedText() {
        return ParsedText;
    }

    public String getTextOrientation() {
        return TextOrientation;
    }

    public JsonObject getTextOverlay() {
        return TextOverlay;
    }

    public void setErrorDetails(String errorDetails) {
        ErrorDetails = errorDetails;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public void setFileParseExitCode(int fileParseExitCode) {
        FileParseExitCode = fileParseExitCode;
    }

    public void setParsedText(String parsedText) {
        ParsedText = parsedText;
    }

    public void setTextOrientation(String textOrientation) {
        TextOrientation = textOrientation;
    }

    public void setTextOverlay(JsonObject textOverlay) {
        TextOverlay = textOverlay;
    }

}

class TextOverlay {

}