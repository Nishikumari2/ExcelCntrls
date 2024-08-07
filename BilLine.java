/*
 * InSilico Solutions LLP
 * www.insilicoss.com
 */
package com.insilicoss.cab.saleBill;

import com.insilicoss.database.DBManager;
import lombok.TrackChanges;

/**
 *
 * @author Alaknanda
 */ 
@TrackChanges

public class BilLine {
  
public String cvsBilLineActv;
 
 public int cviBilD;
 
 public int cviItemD;
 
 public int cviItemF;
 
 public String cvsBilLineDesc;
 
 public String cvsBilLineUom;
 
 public int cvnBilLineQty;
 
 public int cvnBilLineUnitPrice;
 
 public int cvnBilLineDscnt;
 
 public int cvnBilLineVal;
 
 public String cvbBilLineHasSupotDoc = "1";
 
 public String cvsBilLineDspsl = " ";
 
 public String cvsCntxt = " ";
 
 public int cviCntxtBizNtyD = -1;
 
 public int cviCntxtNgmtD = -1;
 
 public String cvsBilLineHSN;
 
 public int cviLnkdBilLineD = -1;
 
 public String cvsBilLineNotes = " ";
 
 public int cviBilLineD;
}
