<%@include file="cabeza.jsp" %>
       

    <form accept-charset="UTF-8" action="/session" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="W5LmABAbnWpp8fuBK4FnaNJ4LHGl4lXlXQqVRCxHmAW0xZOCtXJU36sHnPqtv8DynJbhOmoQ+rYclTPqKnzv6A==" /></div>      <div class="auth-form-header">
        <h1>Sign in</h1>
      </div>
      <div class="auth-form-body">
        <label for="login_field">
          Username or Email
        </label>
        <input autocapitalize="off" autocorrect="off" autofocus="autofocus" class="input-block" id="login_field" name="login" tabindex="1" type="text" />

        <label for="password">
          Password <a href="/password_reset">(forgot password)</a>
        </label>
        <input class="input-block" id="password" name="password" tabindex="2" type="password" />

        <input id="return_to" name="return_to" type="hidden" value="/join" />                <input class="btn" data-disable-with="Signing in?" name="commit" tabindex="3" type="submit" value="Sign in" />
      </div>
</form>
<%@include file="pie.jsp" %>