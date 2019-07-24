+function(Handlebars, app) { "use strict";
  if ( !Handlebars ) {
    return;
  }

  Handlebars.registerHelper( 'rownum', function( index, page ) {
    return page.number * page.size + index + 1;
  });
  Handlebars.registerHelper( 'eq', function( value1, value2 ) {
    return value1 == value2;
  });
  Handlebars.registerHelper( 'number', function( value ) {
    return value === null ? 0: value;
  });
  Handlebars.registerHelper( 'number_add', function( number1, number2 ) {
    return number1 + number2;
  });
  Handlebars.registerHelper( 'number_multiply', function( number1, number2 ) {
    return number1 * number2;
  });
  Handlebars.registerHelper( 'format_currency', function( value ) {
    return app.currencySymbol + value.toFixed(2).replace(/\d(?=(\d{3})+\.)/g, '$&,');
  });
  Handlebars.registerHelper( 'format_date', function( value ) {
    return value.substr(0, value.indexOf('T'));
  });
  
}(window.Handlebars, window.app);

+function($, app) { "use strict";
  if ( !app ) {
    return;
  }
  
  app.addPages = function( page ) {
    var pages = [], start, end;
    start = Math.max(0, page.number - app.displayPages / 2);
    end = Math.min(Math.max(page.number + app.displayPages / 2 - 1, app.displayPages - 1), page.totalPages - 1);
    for( var i = start; i <= end; i++ ) {
      pages.push(i);
    }
    page.pages = pages;
  }
}(window.jQuery, window.app);

+function($, app) { "use strict";

  $.fn.appGrid = function(options) {

    options = $.extend({}, $.fn.appGrid.defaults, options);

    return this.each(function() {
      render($(this), options);
    });
  };

  $.fn.appGrid.defaults = {
    beforeSubmitPagination: function( form, pageNumber ) {
      if( !app.beforeSubmitPagination ) {
        return;
      }
      app.beforeSubmitPagination( form, pageNumber );
    }
  };

  function render(elem, options) {
    //
    // 选中
    //
    elem.find('input[type="checkbox"]').iCheck({
        checkboxClass: 'icheckbox_minimal-blue',
        radioClass: 'iradio_minimal-blue'
    });
    elem.find('input[data-action="chk-all"]').on('ifUnchecked', function(event) {
        elem.find('input[type="checkbox"]').iCheck('uncheck');
    });
    elem.find('input[data-action="chk-all"]').on('ifChecked', function(event) {
        elem.find('input[type="checkbox"]').iCheck('check');
    });

    //
    // 翻页
    //
    var listform = elem.find('form[name="listform"]');
    elem.find('.pagination [data-page-number]').click(function() {
      var pageNumber = $(this).data('pageNumber');
      listform.find('[name="pageNumber"]').val( pageNumber );
      options.beforeSubmitPagination( listform, pageNumber );
      listform.submit();
      return false;
    });
  }

}(window.jQuery, window.app);
