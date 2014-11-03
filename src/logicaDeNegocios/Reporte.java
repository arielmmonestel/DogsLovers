package logicaDeNegocios;

public class Reporte {

	private Usuario usuarioQueReporta;
	private int idUsuarioReportado;
	private String motivoReporte;
	
	public Reporte(Usuario pUsuarioQueReporta, int idUsuarioReportado, String pMotivoReporte) {
		setUsuarioQueReporta(pUsuarioQueReporta);
		setIdUsuarioReportado(idUsuarioReportado);
		setMotivoReporte(pMotivoReporte);
	}

	public Usuario getUsuarioQueReporta() {
		return usuarioQueReporta;
	}

	public void setUsuarioQueReporta(Usuario pUsuarioQueReporta) {
		usuarioQueReporta = pUsuarioQueReporta;
	}

	public int getIdUsuarioReportado() {
		return idUsuarioReportado;
	}

	public void setIdUsuarioReportado(int pIdUsuarioReportado) {
		idUsuarioReportado = pIdUsuarioReportado;
	}

	public String getMotivoReporte() {
		return motivoReporte;
	}

	public void setMotivoReporte(String pMotivoReporte) {
		motivoReporte = pMotivoReporte;
	}

}
