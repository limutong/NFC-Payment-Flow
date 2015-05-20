
/**
  *		Terminal command sequence (APDU):
  *		1.Reset the NFC device
  *			ATR
  *		2.Select app AID
  *			9000
  *		3.Select DF
  *			FCI || 9000
  *		4.Read EF
  *			Data || 9000
  *		5.Request device Cryptogram
  *			Crypto
  *		6.Verify Crpytogram
  *			Pass / Reject
  *		7.Do the Debit
  *			9000
  *		8.Update Transaction Record
  *			9000
  *		9.Update Settlement Record
  *			9000
  *		10.Powerdown device
  *		
**/
