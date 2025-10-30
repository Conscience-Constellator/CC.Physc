package CC.Encycloped.Abs.Scal.Physc.Son;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Abs.Org.Syc.SNs.Her.Her_Com;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.UI.Son.Samp_Seq_2_Fil;
import CC.UI.Son.Son_Itrabl;
import CC.Util.Conect.Nod.Tre_Nod;

public class Son_Com extends Phys_Com
{
	public static final Clas_Rap Class=Init_StRt(Son_Com.class
		,Clas_Rap.class
	);/*Dep !done*/

	public Son_Com(Son_Com Stm,Son_Com[] Branch_List)
	{
		this.Stm=Stm;

		this.Branch_List=Branch_List;
	}
	public Son_Com(Son_Com Stm,Samp_Seq_2_Fil Sound,Son_Com[] Branch_List)
	{
		this(Stm,Branch_List);

		this.Sound=Sound;
	}
	public Son_Com(){}

	public Son_Com Stm;
	@Override public void Set_StM(Tre_Nod StM){this.Stm=(Son_Com)StM;}
		@Override public Son_Com StM(){return Stm;}

	public Samp_Seq_2_Fil Sound;
	public Son_Itrabl[] Plaing_List;
	public Her_Com[] Sound_Lisnr_List;

	public short Sampl(long Tim)
	{
		short Sampl=0;

		for(Son_Itrabl Lisnr:Plaing_List){}

		for(Her_Com Lisnr:Sound_Lisnr_List){if(Lisnr.On){Lisnr.Sampl+=Sampl(Tim);}}

		return Sampl;
	}

	public Son_Com[] Branch_List;

	public void Ad_Branch(Tre_Nod Branch){}
	public void Rem_Branch(Tre_Nod Branch){}

	@Override
	public String Get_Phys_Nam(){return "Son";}

	static{Init_Nd(Son_Com.class);}
}