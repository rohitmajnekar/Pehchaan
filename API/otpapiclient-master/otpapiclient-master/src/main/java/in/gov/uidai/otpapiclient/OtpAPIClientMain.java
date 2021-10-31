package in.gov.uidai.otpapiclient;

import in.gov.uidai.otpapiclient.model.OtpRes;

import java.util.Scanner;
import java.util.UUID;

public class OtpAPIClientMain {
	private static String txnId;
    public static void main(String[] args) throws Exception {
        OtpAPIService otpAPIService = new OtpAPIService();
        otpAPIService.readProperties();
        OtpAPIClientMain.txnId = UUID.randomUUID().toString();
        System.out.println("Printing txnId: " + OtpAPIClientMain.txnId);
        String uid = args[0];
        OtpRes otpRes = otpAPIService.getOtpRes(uid, OtpAPIClientMain.txnId);
        System.out.println("Result : " + otpRes.getRet().value() + ", err: " + otpRes.getErr());
    }
    public static String getTxn() { return OtpAPIClientMain.txnId;}
}
