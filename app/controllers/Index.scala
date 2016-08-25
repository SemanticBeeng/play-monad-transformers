package controllers

import play.api.mvc.Controller
import play.api.mvc.Action

class Index extends Controller {
  def index = Action {
    Ok(views.html.index())
  }
}